package nc.bs.riaam.privileges_zx.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.riaam.privileges.AggDateprivileges_zx;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AcePrivileges_zxUnApproveBP {

	public AggDateprivileges_zx[] unApprove(AggDateprivileges_zx[] clientBills,
			AggDateprivileges_zx[] originBills) {
		for (AggDateprivileges_zx clientBill : clientBills) {
			clientBill.getParentVO().setStatus(VOStatus.UPDATED);
		}
		BillUpdate<AggDateprivileges_zx> update = new BillUpdate<AggDateprivileges_zx>();
		AggDateprivileges_zx[] returnVos = update.update(clientBills, originBills);
		return returnVos;
	}
}
