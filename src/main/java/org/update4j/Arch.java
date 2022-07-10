package org.update4j;

public enum Arch {
    X64("x64"),
    ARM64("arm64");

    public static final Arch CURRENT;

    static {
        String arch = System.getProperty("os.arch");
        switch (arch) {
            case "x86_64":
            case "amd64":
                CURRENT = X64;
                break;
            case "aarch64":
                CURRENT = ARM64;
                break;
            default:
                throw new IllegalStateException();
        }
    }


    public final String id;

    Arch(String id) {
        this.id = id;
    }

    public static Arch fromId(String id) {
        switch (id) {
            case "x64":
                return X64;
            case "arm64":
                return ARM64;
        }

        throw new IllegalStateException();
    }
}
