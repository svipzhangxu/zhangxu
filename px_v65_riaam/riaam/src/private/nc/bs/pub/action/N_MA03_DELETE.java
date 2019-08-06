package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

import nc.bs.riaam.privileges.plugin.bpplugin.PrivilegesPluginPoint;
import nc.vo.riaam.privileges.AggDateprivileges_zx;
import nc.itf.riaam.IPrivilegesMaintain;

public class N_MA03_DELETE extends AbstractPfAction<AggDateprivileges_zx> {

	@Override
	protected CompareAroundProcesser<AggDateprivileges_zx> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggDateprivileges_zx> processor = new CompareAroundProcesser<AggDateprivileges_zx>(
				PrivilegesPluginPoint.SCRIPT_DELETE);
		// TODO 在此处添加前后规则
		return processor;
	}

	@Override
	protected AggDateprivileges_zx[] processBP(Object userObj,
			AggDateprivileges_zx[] clientFullVOs, AggDateprivileges_zx[] originBills) {
		IPrivilegesMaintain operator = NCLocator.getInstance().lookup(
				IPrivilegesMaintain.class);
		try {
			operator.delete(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return clientFullVOs;
	}

}
