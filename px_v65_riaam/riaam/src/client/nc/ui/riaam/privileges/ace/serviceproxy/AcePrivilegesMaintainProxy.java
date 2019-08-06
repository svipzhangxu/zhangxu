package nc.ui.riaam.privileges.ace.serviceproxy;

import nc.bs.framework.common.NCLocator;
import nc.itf.riaam.IPrivilegesMaintain;
import nc.ui.pubapp.uif2app.query2.model.IQueryService;
import nc.ui.querytemplate.querytree.IQueryScheme;

/**
 * ʾ�����ݵĲ�������
 * 
 * @author author
 * @version tempProject version
 */
public class AcePrivilegesMaintainProxy implements IQueryService {
	@Override
	public Object[] queryByQueryScheme(IQueryScheme queryScheme)
			throws Exception {
		IPrivilegesMaintain query = NCLocator.getInstance().lookup(
				IPrivilegesMaintain.class);
		return query.query(queryScheme);
	}

}