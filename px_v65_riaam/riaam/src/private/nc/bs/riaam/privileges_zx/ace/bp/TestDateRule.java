package nc.bs.riaam.privileges_zx.ace.bp;

import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pubapp.AppContext;
import nc.vo.riaam.privileges.AggDateprivileges_zx;

public class TestDateRule implements IRule<AggDateprivileges_zx> {

	@Override
	public void process(AggDateprivileges_zx[] arg0) {
		// TODO �Զ����ɵķ������
		UFDateTime time = AppContext.getInstance().getServerTime();
		for(AggDateprivileges_zx arg1:arg0){
			arg1.getParentVO().setVdef0(time.toString());
		}
		
		
	}

}
