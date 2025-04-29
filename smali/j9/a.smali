.class public final Lj9/a;
.super Li9/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj9/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li9/y<",
        "Lj9/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final c:Li9/w0;


# instance fields
.field private final a:Li9/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/v0<",
            "*>;"
        }
    .end annotation
.end field

.field private b:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lj9/a;->j()Li9/w0;

    move-result-object v0

    sput-object v0, Lj9/a;->c:Li9/w0;

    return-void
.end method

.method private constructor <init>(Li9/v0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/v0<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Li9/y;-><init>()V

    const-string v0, "delegateBuilder"

    invoke-static {p1, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li9/v0;

    iput-object p1, p0, Lj9/a;->a:Li9/v0;

    return-void
.end method

.method private static j()Li9/w0;
    .locals 5

    const-string v0, "AndroidChannelBuilder"

    const/4 v1, 0x0

    :try_start_0
    const-class v2, Lk9/g;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    const-class v3, Li9/w0;

    invoke-virtual {v2, v3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v3, 0x0

    :try_start_2
    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li9/w0;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    invoke-static {v2}, Li9/k0;->a(Li9/w0;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v2, "OkHttpChannelProvider.isAvailable() returned false"

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_0
    return-object v2

    :catch_0
    move-exception v2

    const-string v3, "Failed to construct OkHttpChannelProvider"

    invoke-static {v0, v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v1

    :catch_1
    move-exception v2

    const-string v3, "Couldn\'t cast OkHttpChannelProvider to ManagedChannelProvider"

    invoke-static {v0, v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v1

    :catch_2
    move-exception v2

    const-string v3, "Failed to find OkHttpChannelProvider"

    invoke-static {v0, v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v1
.end method

.method public static k(Li9/v0;)Lj9/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/v0<",
            "*>;)",
            "Lj9/a;"
        }
    .end annotation

    new-instance v0, Lj9/a;

    invoke-direct {v0, p0}, Lj9/a;-><init>(Li9/v0;)V

    return-object v0
.end method


# virtual methods
.method public a()Li9/u0;
    .locals 3

    new-instance v0, Lj9/a$b;

    iget-object v1, p0, Lj9/a;->a:Li9/v0;

    invoke-virtual {v1}, Li9/v0;->a()Li9/u0;

    move-result-object v1

    iget-object v2, p0, Lj9/a;->b:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lj9/a$b;-><init>(Li9/u0;Landroid/content/Context;)V

    return-object v0
.end method

.method protected e()Li9/v0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li9/v0<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lj9/a;->a:Li9/v0;

    return-object v0
.end method

.method public i(Landroid/content/Context;)Lj9/a;
    .locals 0

    iput-object p1, p0, Lj9/a;->b:Landroid/content/Context;

    return-object p0
.end method
