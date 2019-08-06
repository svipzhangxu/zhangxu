package nc.ui.riaam.privileges.ace.handler;

import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardHeadTailAfterEditEvent;
import nc.util.mmf.framework.base.MMValueCheck;
import nc.vo.ecpubapp.pattern.exception.ExceptionUtils;
import nc.vo.pub.BusinessException;

public class AceHeadTailAfterHandler implements
		IAppEventHandler<CardHeadTailAfterEditEvent> {

	@Override
	public void handleAppEvent(CardHeadTailAfterEditEvent z) {
		Object x = z.getValue();
		System.out.println(x);
		if ("cuserid".equals(z.getKey())) {
			if (MMValueCheck.isNotEmpty(z.getValue())) {
				String pk = z.getValue().toString();
				IUAPQueryBS query = NCLocator.getInstance().lookup(
						IUAPQueryBS.class);
				String sql = "select user_name from sm_user where cuserid = '"
						+ pk + "'";
				String name = new String();
				try {
					name = (String) query.executeQuery(sql,
							new ColumnProcessor());
				} catch (BusinessException e) {
					ExceptionUtils.wrappBusinessException(e.getMessage());
				}
				z.getBillCardPanel().setHeadItem("approvenote", name);
			}
		}
	}
}
