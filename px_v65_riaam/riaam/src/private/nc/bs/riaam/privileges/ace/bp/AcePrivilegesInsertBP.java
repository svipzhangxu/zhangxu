package nc.bs.riaam.privileges.ace.bp;

import nc.bs.riaam.privileges.plugin.bpplugin.PrivilegesPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.InsertBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.riaam.privileges.AggDateprivileges_zx;

/**
 * 标准单据新增BP
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
	 * 新增后规则
	 * 
	 * @param processor
	 */
	private void addAfterRule(AroundProcesser<AggDateprivileges_zx> processor) {
		// TODO 新增后规则
		IRule<AggDateprivileges_zx> rule = null;
	}

	/**
	 * 新增前规则
	 * 
	 * @param processor
	 */
	private void addBeforeRule(AroundProcesser<AggDateprivileges_zx> processer) {
		// TODO 新增前规则
		IRule<AggDateprivileges_zx> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillInsertDataRule();
		processer.addBeforeRule(rule);
	}
}
