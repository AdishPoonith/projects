.class final Lcom/google/crypto/tink/shaded/protobuf/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->c()Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/p;->a:Ljava/lang/Class;

    return-void
.end method

.method public static a()Lcom/google/crypto/tink/shaded/protobuf/q;
    .locals 1

    const-string v0, "getEmptyRegistry"

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/p;->b(Ljava/lang/String;)Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/q;->d:Lcom/google/crypto/tink/shaded/protobuf/q;

    :goto_0
    return-object v0
.end method

.method private static final b(Ljava/lang/String;)Lcom/google/crypto/tink/shaded/protobuf/q;
    .locals 4

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/p;->a:Ljava/lang/Class;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/4 v2, 0x0

    :try_start_0
    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, p0, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    new-array v0, v2, [Ljava/lang/Object;

    invoke-virtual {p0, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/q;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v1
.end method

.method static c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    :try_start_0
    const-string v0, "com.google.crypto.tink.shaded.protobuf.ExtensionRegistry"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
