package nc.bs.riaam.privileges.ace.bp;

import nc.bs.riaam.privileges.plugin.bpplugin.PrivilegesPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.InsertBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.riaam.privileges.AggDateprivileges_zx;

/**
 * ��׼��������BP
 */
public class AcePrivilegesInsertBP {

	public AggDateprivileges_zx[] insert(AggDateprivileges_zx[] bills) {

		InsertBPTemplate<AggDateprivileges_zx> bp = new InsertBPTemplate<AggDateprivileges_zx>(
				PrivilegesPluginPoint.INSERT);
		this.addBeforeRule(bp.getAroundProcesser());
		this.addAfterRule(bp.getAroundProcesser());
		return bp.insert(bills);

	}

	/**
	 * ���������
	 * 
	 * @param processor
	 */
	private void addAfterRule(AroundProcesser<AggDateprivileges_zx> processor) {
		// TODO ���������
		IRule<AggDateprivileges_zx> rule = null;
	}

	/**
	 * ����ǰ����
	 * 
	 * @param processor
	 */
	private void addBeforeRule(AroundProcesser<AggDateprivileges_zx> processer) {
		// TODO ����ǰ����
		IRule<AggDateprivileges_zx> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillInsertDataRule();
		processer.addBeforeRule(rule);
	}
}
