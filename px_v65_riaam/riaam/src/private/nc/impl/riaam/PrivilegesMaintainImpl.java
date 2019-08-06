package nc.impl.riaam;

import nc.impl.pub.ace.AcePrivilegesPubServiceImpl;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.riaam.privileges.AggDateprivileges_zx;
import nc.itf.riaam.IPrivilegesMaintain;
import nc.vo.pub.BusinessException;

public class PrivilegesMaintainImpl extends AcePrivilegesPubServiceImpl
		implements IPrivilegesMaintain {

	@Override
	public void delete(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException {
		super.pubdeleteBills(clientFullVOs, originBills);
	}

	@Override
	public AggDateprivileges_zx[] insert(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException {
		return super.pubinsertBills(clientFullVOs, originBills);
	}

	@Override
	public AggDateprivileges_zx[] update(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException {
		return super.pubupdateBills(clientFullVOs, originBills);
	}

	@Override
	public AggDateprivileges_zx[] query(IQueryScheme queryScheme)
			throws BusinessException {
		return super.pubquerybills(queryScheme);
	}

	@Override
	public AggDateprivileges_zx[] save(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException {
		return super.pubsendapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggDateprivileges_zx[] unsave(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException {
		return super.pubunsendapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggDateprivileges_zx[] approve(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException {
		return super.pubapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggDateprivileges_zx[] unapprove(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException {
		return super.pubunapprovebills(clientFullVOs, originBills);
	}

}
