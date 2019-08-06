package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

import nc.bs.riaam.privileges_zx.plugin.bpplugin.Privileges_zxPluginPoint;
import nc.vo.riaam.privileges.AggDateprivileges_zx;
import nc.itf.riaam.IPrivileges_zxMaintain;

public class N_MA77_DELETE extends AbstractPfAction<AggDateprivileges_zx> {

	@Override
	protected CompareAroundProcesser<AggDateprivileges_zx> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggDateprivileges_zx> processor = new CompareAroundProcesser<AggDateprivileges_zx>(
				Privileges_zxPluginPoint.SCRIPT_DELETE);
		// TODO 在此处添加前后规则
		return processor;
	}

	@Override
	protected AggDateprivileges_zx[] processBP(Object userObj,
			AggDateprivileges_zx[] clientFullVOs, AggDateprivileges_zx[] originBills) {
		IPrivileges_zxMaintain operator = NCLocator.getInstance().lookup(
				IPrivileges_zxMaintain.class);
		try {
			operator.delete(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return clientFullVOs;
	}

}
