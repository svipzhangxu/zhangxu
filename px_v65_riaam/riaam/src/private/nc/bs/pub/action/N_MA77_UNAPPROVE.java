package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.pubapp.pub.rule.UnapproveStatusCheckRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

import nc.bs.riaam.privileges_zx.plugin.bpplugin.Privileges_zxPluginPoint;
import nc.vo.riaam.privileges.AggDateprivileges_zx;
import nc.itf.riaam.IPrivileges_zxMaintain;

public class N_MA77_UNAPPROVE extends AbstractPfAction<AggDateprivileges_zx> {

	@Override
	protected CompareAroundProcesser<AggDateprivileges_zx> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggDateprivileges_zx> processor = new CompareAroundProcesser<AggDateprivileges_zx>(
				Privileges_zxPluginPoint.UNAPPROVE);
		// TODO �ڴ˴����ǰ�����
		processor.addBeforeRule(new UnapproveStatusCheckRule());

		return processor;
	}

	@Override
	protected AggDateprivileges_zx[] processBP(Object userObj,
			AggDateprivileges_zx[] clientFullVOs, AggDateprivileges_zx[] originBills) {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AggDateprivileges_zx[] bills = null;
		try {
			IPrivileges_zxMaintain operator = NCLocator.getInstance()
					.lookup(IPrivileges_zxMaintain.class);
			bills = operator.unapprove(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}

}
