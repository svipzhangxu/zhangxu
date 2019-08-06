package nc.bs.riaam.privileges_zx.ace.bp;

import nc.bs.riaam.privileges_zx.plugin.bpplugin.Privileges_zxPluginPoint;
import nc.vo.riaam.privileges.AggDateprivileges_zx;

import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * ��׼����ɾ��BP
 */
public class AcePrivileges_zxDeleteBP {

	public void delete(AggDateprivileges_zx[] bills) {

		DeleteBPTemplate<AggDateprivileges_zx> bp = new DeleteBPTemplate<AggDateprivileges_zx>(
				Privileges_zxPluginPoint.DELETE);
		// ����ִ��ǰ����
		this.addBeforeRule(bp.getAroundProcesser());
		// ����ִ�к�ҵ�����
		this.addAfterRule(bp.getAroundProcesser());
		bp.delete(bills);
	}

	private void addBeforeRule(AroundProcesser<AggDateprivileges_zx> processer) {
		// TODO ǰ����
		IRule<AggDateprivileges_zx> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
		processer.addBeforeRule(rule);
	}

	/**
	 * ɾ����ҵ�����
	 * 
	 * @param processer
	 */
	private void addAfterRule(AroundProcesser<AggDateprivileges_zx> processer) {
		// TODO �����

	}
}
