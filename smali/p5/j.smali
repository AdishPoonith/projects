.class public final Lp5/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Lt5/j0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final c:Lt5/j0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final d:Lt5/j0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp5/i;

    invoke-direct {v0}, Lp5/i;-><init>()V

    invoke-virtual {v0}, Lp5/i;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lp5/j;->a:Ljava/lang/String;

    invoke-static {}, Lt5/j0;->O()Lt5/j0;

    move-result-object v0

    sput-object v0, Lp5/j;->b:Lt5/j0;

    sput-object v0, Lp5/j;->c:Lt5/j0;

    sput-object v0, Lp5/j;->d:Lt5/j0;

    :try_start_0
    invoke-static {}, Lp5/j;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lp5/j;->b()V

    return-void
.end method

.method public static b()V
    .locals 2

    invoke-static {}, Lp5/m;->f()V

    const/4 v0, 0x1

    invoke-static {v0}, Lp5/i;->p(Z)V

    invoke-static {}, Lk5/a;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lp5/b;->o(Z)V

    return-void
.end method
