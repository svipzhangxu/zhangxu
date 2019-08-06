package nc.bs.riaam.privileges.ace.bp;

import nc.bs.riaam.privileges.plugin.bpplugin.PrivilegesPluginPoint;
import nc.vo.riaam.privileges.AggDateprivileges_zx;

import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * ��׼����ɾ��BP
 */
public class AcePrivilegesDeleteBP {

	public void delete(AggDateprivileges_zx[] bills) {

		DeleteBPTemplate<AggDateprivileges_zx> bp = new DeleteBPTemplate<AggDateprivileges_zx>(
				PrivilegesPluginPoint.DELETE);
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
