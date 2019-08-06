package nc.vo.riaam.privileges;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggDateprivileges_zxMeta extends AbstractBillMeta{
	
	public AggDateprivileges_zxMeta(){
		this.init();
	}
	
	private void init() {
		this.setParent(nc.vo.riaam.privileges.Dateprivileges_zx.class);
		this.addChildren(nc.vo.riaam.privileges.PrivilegesMarbasclass.class);
		this.addChildren(nc.vo.riaam.privileges.PrivilegesMaterial.class);
	}
}