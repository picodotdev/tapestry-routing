package org.tynamo.routing.services;

import org.apache.tapestry5.internal.InternalConstants;
import org.apache.tapestry5.internal.InternalSymbols;
import org.apache.tapestry5.ioc.Configuration;
import org.apache.tapestry5.ioc.MappedConfiguration;
import org.apache.tapestry5.ioc.annotations.Contribute;
import org.apache.tapestry5.ioc.services.ApplicationDefaults;
import org.apache.tapestry5.ioc.services.SymbolProvider;
import org.tynamo.routing.RoutingSymbols;
import org.tynamo.routing.pages.SimplePage;

public class TestModule {

	@Contribute(SymbolProvider.class)
	@ApplicationDefaults
	public static void provideApplicationDefaults(MappedConfiguration<String, String> configuration) {
		configuration.add(InternalConstants.TAPESTRY_APP_PACKAGE_PARAM, "org.tynamo.routing");
		configuration.add(InternalSymbols.APP_PACKAGE_PATH, "org/tynamo/routing");
		configuration.add(RoutingSymbols.DISABLE_AUTODISCOVERY, "true");
	}

	@Contribute(RouterDispatcher.class)
	public static void routerDispatcher(Configuration<Class> configuration) {
		configuration.add(SimplePage.class);
	}


}