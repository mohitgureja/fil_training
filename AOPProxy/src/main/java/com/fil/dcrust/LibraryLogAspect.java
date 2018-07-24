package com.fil.dcrust;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import java.util.Arrays;

//import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

@Aspect
@Component
public class LibraryLogAspect {

	@Before ("execution(* com.fil.dcrust.MyLib*.get*(..))")
	public void logBeforeLibraryService(JoinPoint joinPoint)
	{
		System.out.println("Before "+ joinPoint.getSignature().getName());
	}
	
	@After ("within(com.fil.dcrust.MyLibServiceImpl)")
	public void logAfterLibraryService(JoinPoint joinPoint)
	{
		System.out.println("After "+ joinPoint.getSignature().getName());
		Object[] args = joinPoint.getArgs();
		System.out.println("Method called with Args : " + Arrays.toString(args));
	}
}
