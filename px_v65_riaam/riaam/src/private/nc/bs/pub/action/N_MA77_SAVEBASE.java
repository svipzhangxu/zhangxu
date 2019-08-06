package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

import nc.bs.riaam.privileges_zx.plugin.bpplugin.Privileges_zxPluginPoint;
import nc.vo.riaam.privileges.AggDateprivileges_zx;
import nc.itf.riaam.IPrivileges_zxMaintain;

public class N_MA77_SAVEBASE extends AbstractPfAction<AggDateprivileges_zx> {

	@Override
	protected CompareAroundProcesser<AggDateprivileges_zx> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggDateprivileges_zx> processor = null;
		AggDateprivileges_zx[] clientFullVOs = (AggDateprivileges_zx[]) this.getVos();
		if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
				.getPrimaryKey())) {
			processor = new CompareAroundProcesser<AggDateprivileges_zx>(
					Privileges_zxPluginPoint.SCRIPT_UPDATE);
		} else {
			processor = new CompareAroundProcesser<AggDateprivileges_zx>(
					Privileges_zxPluginPoint.SCRIPT_INSERT);
		}
		// TODO 在此处添加前后规则
		IRule<AggDateprivileges_zx> rule = null;

		return processor;
	}

	@Override
	protected AggDateprivileges_zx[] processBP(Object userObj,
			AggDateprivileges_zx[] clientFullVOs, AggDateprivileges_zx[] originBills) {

		AggDateprivileges_zx[] bills = null;
		try {
			IPrivileges_zxMaintain operator = NCLocator.getInstance()
					.lookup(IPrivileges_zxMaintain.class);
			if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
					.getPrimaryKey())) {
				bills = operator.update(clientFullVOs, originBills);
			} else {
				bills = operator.insert(clientFullVOs, originBills);
			}
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}
}
