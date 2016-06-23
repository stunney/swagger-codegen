package io.swagger.codegen.aspnetcore1;

import io.swagger.codegen.AbstractOptionsTest;
import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.languages.AspNetCore1ServerCodegen;
import io.swagger.codegen.options.AspNetCore1ServerOptionsProvider;
import mockit.Expectations;
import mockit.Tested;

public class AspNetCore1ServerOptionsTest extends AbstractOptionsTest {

    @Tested
    private AspNetCore1ServerCodegen serverCodegen;

    public AspNetCore1ServerOptionsTest() {
        super(new AspNetCore1ServerOptionsProvider());
    }

    @Override
    protected CodegenConfig getCodegenConfig() {
        return serverCodegen;
    }

    @SuppressWarnings("unused")
    @Override
    protected void setExpectations() {
        new Expectations(serverCodegen) {{
            serverCodegen.setPackageName(AspNetCore1ServerOptionsProvider.PACKAGE_NAME_VALUE);
            times = 1;
            serverCodegen.setPackageVersion(AspNetCore1ServerOptionsProvider.PACKAGE_VERSION_VALUE);
            times = 1;
            serverCodegen.setSourceFolder(AspNetCore1ServerOptionsProvider.SOURCE_FOLDER_VALUE);
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
