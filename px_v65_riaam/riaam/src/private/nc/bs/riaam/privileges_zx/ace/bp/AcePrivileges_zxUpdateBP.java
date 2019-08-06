package nc.bs.riaam.privileges_zx.ace.bp;

import nc.bs.riaam.privileges_zx.plugin.bpplugin.Privileges_zxPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.riaam.privileges.AggDateprivileges_zx;

/**
 * �޸ı����BP
 * 
 */
public class AcePrivileges_zxUpdateBP {

	public AggDateprivileges_zx[] update(AggDateprivileges_zx[] bills,
			AggDateprivileges_zx[] originBills) {
		// �����޸�ģ��
		UpdateBPTemplate<AggDateprivileges_zx> bp = new UpdateBPTemplate<AggDateprivileges_zx>(
				Privileges_zxPluginPoint.UPDATE);
		// ִ��ǰ����
		this.addBeforeRule(bp.getAroundProcesser());
		// ִ�к����
		this.addAfterRule(bp.getAroundProcesser());
		return bp.update(bills, originBills);
	}

	private void addAfterRule(CompareAroundProcesser<AggDateprivileges_zx> processer) {
		// TODO �����
		IRule<AggDateprivileges_zx> rule = null;

	}

	private void addBeforeRule(CompareAroundProcesser<AggDateprivileges_zx> processer) {
		// TODO ǰ����
		IRule<AggDateprivileges_zx> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
		processer.addBeforeRule(rule);
	}

}
