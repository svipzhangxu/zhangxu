package nc.vo.riaam.privileges;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.riaam.privileges.Dateprivileges_zx")

public class AggDateprivileges_zx extends AbstractBill {
	
	  @Override
	  public IBillMeta getMetaData() {
	  	IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggDateprivileges_zxMeta.class);
	  	return billMeta;
	  }
	    
	  @Override
	  public Dateprivileges_zx getParentVO(){
	  	return (Dateprivileges_zx)this.getParent();
	  }
	  
}