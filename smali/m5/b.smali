.class public final Lm5/b;
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


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm5/a;

    invoke-direct {v0}, Lm5/a;-><init>()V

    invoke-virtual {v0}, Lm5/a;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lm5/b;->a:Ljava/lang/String;

    invoke-static {}, Lt5/j0;->O()Lt5/j0;

    move-result-object v0

    sput-object v0, Lm5/b;->b:Lt5/j0;

    invoke-static {}, Lt5/j0;->O()Lt5/j0;

    move-result-object v0

    sput-object v0, Lm5/b;->c:Lt5/j0;

    :try_start_0
    invoke-static {}, Lm5/b;->a()V
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
    .locals 1

    invoke-static {}, Lm5/c;->e()V

    invoke-static {}, Lk5/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Lm5/a;->m(Z)V

    return-void
.end method
