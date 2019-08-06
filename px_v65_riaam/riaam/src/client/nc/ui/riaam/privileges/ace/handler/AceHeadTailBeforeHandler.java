package nc.ui.riaam.privileges.ace.handler;

import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardHeadTailBeforeEditEvent;

public class AceHeadTailBeforeHandler implements
		IAppEventHandler<CardHeadTailBeforeEditEvent> {

	@Override
	public void handleAppEvent(CardHeadTailBeforeEditEvent e) {
		e.setReturnValue(true);
		/*if("approvenote".equals(e.getKey())){
			e.getBillCardPanel().setHeadItem("approvenote", "≤‚ ‘≤‚ ‘≤‚ ‘");
		}*/
	}

}
