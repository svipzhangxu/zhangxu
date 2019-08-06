package nc.ui.pubapp.uif2app.actions;

import java.awt.event.ActionEvent;

import nc.ui.pubapp.uif2app.event.card.CardHeadTailBeforeEditEvent;
import nc.ui.uif2.NCAction;
import nc.util.mmf.framework.base.MMValueCheck;

public class TestAction extends NCAction {

	public TestAction() {
		this.setCode("testAction");
		this.setBtnName("≤‚ ‘∞¥≈•");
	}

	public nc.ui.pubapp.uif2app.model.BillManageModel model;

	public nc.ui.pubapp.uif2app.view.ShowUpableBillForm editor;

	public nc.ui.pubapp.uif2app.view.ShowUpableBillForm getEditor() {
		return editor;
	}

	public void setEditor(nc.ui.pubapp.uif2app.view.ShowUpableBillForm editor) {
		this.editor = editor;
	}

	@Override
	public void doAction(ActionEvent e) throws Exception {

		int i = 1;
	}

	public nc.ui.pubapp.uif2app.model.BillManageModel getModel() {
		return model;
	}

	public void setModel(nc.ui.pubapp.uif2app.model.BillManageModel model) {
		this.model = model;
		model.addAppEventListener(this);
	}

	@Override
	protected boolean isActionEnable() {
		if (MMValueCheck.isEmpty(getModel().getSelectedData()))
			return false;
		return true;
	}

}
