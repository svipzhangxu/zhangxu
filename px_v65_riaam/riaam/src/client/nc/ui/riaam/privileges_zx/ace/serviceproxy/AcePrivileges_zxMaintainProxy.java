package nc.ui.riaam.privileges_zx.ace.serviceproxy;

import nc.bs.framework.common.NCLocator;
import nc.itf.riaam.IPrivileges_zxMaintain;
import nc.ui.pubapp.uif2app.query2.model.IQueryService;
import nc.ui.querytemplate.querytree.IQueryScheme;

/**
 * ʾ�����ݵĲ�������
 * 
 * @author author
 * @version tempProject version
 */
public class AcePrivileges_zxMaintainProxy implements IQueryService {
	@Override
	public Object[] queryByQueryScheme(IQueryScheme queryScheme)
			throws Exception {
		IPrivileges_zxMaintain query = NCLocator.getInstance().lookup(
				IPrivileges_zxMaintain.class);
		return query.query(queryScheme);
	}

}