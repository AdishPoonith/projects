.class public final Lh5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String;

.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/lang/String;

.field public static final g:Ljava/lang/String;

.field public static final h:Ljava/lang/String;

.field public static final i:Lt5/j0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final j:Lt5/j0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final k:Lt5/j0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh5/c;

    invoke-direct {v0}, Lh5/c;-><init>()V

    invoke-virtual {v0}, Lh5/c;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lh5/a;->a:Ljava/lang/String;

    new-instance v0, Lh5/f;

    invoke-direct {v0}, Lh5/f;-><init>()V

    invoke-virtual {v0}, Lh5/f;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lh5/a;->b:Ljava/lang/String;

    new-instance v0, Lh5/g;

    invoke-direct {v0}, Lh5/g;-><init>()V

    invoke-virtual {v0}, Lh5/g;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lh5/a;->c:Ljava/lang/String;

    new-instance v0, Lh5/e;

    invoke-direct {v0}, Lh5/e;-><init>()V

    invoke-virtual {v0}, Lh5/e;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lh5/a;->d:Ljava/lang/String;

    new-instance v0, Lh5/i;

    invoke-direct {v0}, Lh5/i;-><init>()V

    invoke-virtual {v0}, Lh5/i;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lh5/a;->e:Ljava/lang/String;

    new-instance v0, Lh5/k;

    invoke-direct {v0}, Lh5/k;-><init>()V

    invoke-virtual {v0}, Lh5/k;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lh5/a;->f:Ljava/lang/String;

    new-instance v0, Lh5/h;

    invoke-direct {v0}, Lh5/h;-><init>()V

    invoke-virtual {v0}, Lh5/h;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lh5/a;->g:Ljava/lang/String;

    new-instance v0, Lh5/l;

    invoke-direct {v0}, Lh5/l;-><init>()V

    invoke-virtual {v0}, Lh5/l;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lh5/a;->h:Ljava/lang/String;

    invoke-static {}, Lt5/j0;->O()Lt5/j0;

    move-result-object v0

    sput-object v0, Lh5/a;->i:Lt5/j0;

    sput-object v0, Lh5/a;->j:Lt5/j0;

    sput-object v0, Lh5/a;->k:Lt5/j0;

    :try_start_0
    invoke-static {}, Lh5/a;->a()V
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

    invoke-static {}, Lh5/a;->b()V

    return-void
.end method

.method public static b()V
    .locals 2

    invoke-static {}, Lh5/b;->e()V

    invoke-static {}, Lp5/j;->b()V

    const/4 v0, 0x1

    invoke-static {v0}, Lh5/c;->p(Z)V

    invoke-static {v0}, Lh5/f;->o(Z)V

    invoke-static {}, Lk5/a;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lh5/e;->o(Z)V

    invoke-static {v0}, Lh5/g;->p(Z)V

    invoke-static {v0}, Lh5/h;->m(Z)V

    invoke-static {v0}, Lh5/i;->m(Z)V

    invoke-static {v0}, Lh5/k;->m(Z)V

    invoke-static {v0}, Lh5/l;->m(Z)V

    return-void
.end method
