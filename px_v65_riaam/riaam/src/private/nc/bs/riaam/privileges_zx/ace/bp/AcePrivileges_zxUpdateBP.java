package nc.bs.riaam.privileges_zx.ace.bp;

import nc.bs.riaam.privileges_zx.plugin.bpplugin.Privileges_zxPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.riaam.privileges.AggDateprivileges_zx;

/**
 * 修改保存的BP
 * 
 */
public class AcePrivileges_zxUpdateBP {

	public AggDateprivileges_zx[] update(AggDateprivileges_zx[] bills,
			AggDateprivileges_zx[] originBills) {
		// 调用修改模板
		UpdateBPTemplate<AggDateprivileges_zx> bp = new UpdateBPTemplate<AggDateprivileges_zx>(
				Privileges_zxPluginPoint.UPDATE);
		// 执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 执行后规则
		this.addAfterRule(bp.getAroundProcesser());
		return bp.update(bills, originBills);
	}

	private void addAfterRule(CompareAroundProcesser<AggDateprivileges_zx> processer) {
		// TODO 后规则
		IRule<AggDateprivileges_zx> rule = null;

	}

	private void addBeforeRule(CompareAroundProcesser<AggDateprivileges_zx> processer) {
		// TODO 前规则
		IRule<AggDateprivileges_zx> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
		processer.addBeforeRule(rule);
	}

}
