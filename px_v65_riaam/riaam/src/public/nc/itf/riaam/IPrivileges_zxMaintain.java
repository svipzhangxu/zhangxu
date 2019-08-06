package nc.itf.riaam;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.riaam.privileges.AggDateprivileges_zx;
import nc.vo.pub.BusinessException;

public interface IPrivileges_zxMaintain {

	public void delete(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException;

	public AggDateprivileges_zx[] insert(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException;

	public AggDateprivileges_zx[] update(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException;

	public AggDateprivileges_zx[] query(IQueryScheme queryScheme)
			throws BusinessException;

	public AggDateprivileges_zx[] save(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException;

	public AggDateprivileges_zx[] unsave(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException;

	public AggDateprivileges_zx[] approve(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException;

	public AggDateprivileges_zx[] unapprove(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException;
}
