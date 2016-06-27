package io.swagger.codegen.aspnet;

import io.swagger.codegen.AbstractOptionsTest;
import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.languages.AspNetServerCodegen;
import io.swagger.codegen.options.AspNetServerOptionsProvider;
import mockit.Expectations;
import mockit.Tested;

public class AspNetServerOptionsTest extends AbstractOptionsTest {

    @Tested
    private AspNetServerCodegen serverCodegen;

    public AspNetServerOptionsTest() {
        super(new AspNetServerOptionsProvider());
    }

    @Override
    protected CodegenConfig getCodegenConfig() {
        return serverCodegen;
    }

    @SuppressWarnings("unused")
    @Override
    protected void setExpectations() {
        new Expectations(serverCodegen) {{
            serverCodegen.setPackageName(AspNetServerOptionsProvider.PACKAGE_NAME_VALUE);
            times = 1;
            serverCodegen.setPackageVersion(AspNetServerOptionsProvider.PACKAGE_VERSION_VALUE);
            times = 1;
            serverCodegen.setSourceFolder(AspNetServerOptionsProvider.SOURCE_FOLDER_VALUE);
            times = 1;
            serverCodegen.useDateTimeOffset(true);
            times = 1;
            serverCodegen.setUseCollection(false);
            times = 1;
            serverCodegen.setReturnICollection(false);
            times = 1;
        }};
    }
}
