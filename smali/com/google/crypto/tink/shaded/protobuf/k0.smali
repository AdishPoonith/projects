.class final Lcom/google/crypto/tink/shaded/protobuf/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/i1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/shaded/protobuf/k0$b;
    }
.end annotation


# static fields
.field private static final b:Lcom/google/crypto/tink/shaded/protobuf/r0;


# instance fields
.field private final a:Lcom/google/crypto/tink/shaded/protobuf/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/k0$a;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/k0$a;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/k0;->b:Lcom/google/crypto/tink/shaded/protobuf/r0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/k0;->b()Lcom/google/crypto/tink/shaded/protobuf/r0;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/k0;-><init>(Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/b0;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/r0;

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/k0;->a:Lcom/google/crypto/tink/shaded/protobuf/r0;

    return-void
.end method

.method private static b()Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 4

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/k0$b;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/google/crypto/tink/shaded/protobuf/r0;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/y;->c()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/k0;->c()Lcom/google/crypto/tink/shaded/protobuf/r0;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/k0$b;-><init>([Lcom/google/crypto/tink/shaded/protobuf/r0;)V

    return-object v0
.end method

.method private static c()Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 4

    :try_start_0
    const-string v0, "com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getInstance"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/r0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/k0;->b:Lcom/google/crypto/tink/shaded/protobuf/r0;

    return-object v0
.end method

.method private static d(Lcom/google/crypto/tink/shaded/protobuf/q0;)Z
    .locals 1

    invoke-interface {p0}, Lcom/google/crypto/tink/shaded/protobuf/q0;->b()Lcom/google/crypto/tink/shaded/protobuf/c1;

    move-result-object p0

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/c1;->j:Lcom/google/crypto/tink/shaded/protobuf/c1;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static e(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/q0;)Lcom/google/crypto/tink/shaded/protobuf/h1;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/google/crypto/tink/shaded/protobuf/q0;",
            ")",
            "Lcom/google/crypto/tink/shaded/protobuf/h1<",
            "TT;>;"
        }
    .end annotation

    const-class v0, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/k0;->d(Lcom/google/crypto/tink/shaded/protobuf/q0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/z0;->b()Lcom/google/crypto/tink/shaded/protobuf/x0;

    move-result-object v3

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/i0;->b()Lcom/google/crypto/tink/shaded/protobuf/i0;

    move-result-object v4

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/j1;->M()Lcom/google/crypto/tink/shaded/protobuf/o1;

    move-result-object v5

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->b()Lcom/google/crypto/tink/shaded/protobuf/r;

    move-result-object v6

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p0;->b()Lcom/google/crypto/tink/shaded/protobuf/n0;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lcom/google/crypto/tink/shaded/protobuf/v0;->Q(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/q0;Lcom/google/crypto/tink/shaded/protobuf/x0;Lcom/google/crypto/tink/shaded/protobuf/i0;Lcom/google/crypto/tink/shaded/protobuf/o1;Lcom/google/crypto/tink/shaded/protobuf/r;Lcom/google/crypto/tink/shaded/protobuf/n0;)Lcom/google/crypto/tink/shaded/protobuf/v0;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/z0;->b()Lcom/google/crypto/tink/shaded/protobuf/x0;

    move-result-object v2

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/i0;->b()Lcom/google/crypto/tink/shaded/protobuf/i0;

    move-result-object v3

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/j1;->M()Lcom/google/crypto/tink/shaded/protobuf/o1;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p0;->b()Lcom/google/crypto/tink/shaded/protobuf/n0;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/v0;->Q(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/q0;Lcom/google/crypto/tink/shaded/protobuf/x0;Lcom/google/crypto/tink/shaded/protobuf/i0;Lcom/google/crypto/tink/shaded/protobuf/o1;Lcom/google/crypto/tink/shaded/protobuf/r;Lcom/google/crypto/tink/shaded/protobuf/n0;)Lcom/google/crypto/tink/shaded/protobuf/v0;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_1
    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/k0;->d(Lcom/google/crypto/tink/shaded/protobuf/q0;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/z0;->a()Lcom/google/crypto/tink/shaded/protobuf/x0;

    move-result-object v3

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/i0;->a()Lcom/google/crypto/tink/shaded/protobuf/i0;

    move-result-object v4

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/j1;->H()Lcom/google/crypto/tink/shaded/protobuf/o1;

    move-result-object v5

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/r;

    move-result-object v6

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p0;->a()Lcom/google/crypto/tink/shaded/protobuf/n0;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lcom/google/crypto/tink/shaded/protobuf/v0;->Q(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/q0;Lcom/google/crypto/tink/shaded/protobuf/x0;Lcom/google/crypto/tink/shaded/protobuf/i0;Lcom/google/crypto/tink/shaded/protobuf/o1;Lcom/google/crypto/tink/shaded/protobuf/r;Lcom/google/crypto/tink/shaded/protobuf/n0;)Lcom/google/crypto/tink/shaded/protobuf/v0;

    move-result-object p0

    goto :goto_1

    :cond_2
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/z0;->a()Lcom/google/crypto/tink/shaded/protobuf/x0;

    move-result-object v2

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/i0;->a()Lcom/google/crypto/tink/shaded/protobuf/i0;

    move-result-object v3

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/j1;->I()Lcom/google/crypto/tink/shaded/protobuf/o1;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p0;->a()Lcom/google/crypto/tink/shaded/protobuf/n0;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/v0;->Q(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/q0;Lcom/google/crypto/tink/shaded/protobuf/x0;Lcom/google/crypto/tink/shaded/protobuf/i0;Lcom/google/crypto/tink/shaded/protobuf/o1;Lcom/google/crypto/tink/shaded/protobuf/r;Lcom/google/crypto/tink/shaded/protobuf/n0;)Lcom/google/crypto/tink/shaded/protobuf/v0;

    move-result-object p0

    :goto_1
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/h1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/google/crypto/tink/shaded/protobuf/h1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/j1;->J(Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k0;->a:Lcom/google/crypto/tink/shaded/protobuf/r0;

    invoke-interface {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/r0;->a(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/q0;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/q0;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    const-class v1, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/j1;->M()Lcom/google/crypto/tink/shaded/protobuf/o1;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->b()Lcom/google/crypto/tink/shaded/protobuf/r;

    move-result-object v1

    :goto_0
    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/q0;->c()Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/w0;->m(Lcom/google/crypto/tink/shaded/protobuf/o1;Lcom/google/crypto/tink/shaded/protobuf/r;Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/w0;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/j1;->H()Lcom/google/crypto/tink/shaded/protobuf/o1;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/r;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/k0;->e(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/q0;)Lcom/google/crypto/tink/shaded/protobuf/h1;

    move-result-object p1

    return-object p1
.end method
