.class public final Lh1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lh1/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh1/g;

    invoke-direct {v0}, Lh1/g;-><init>()V

    sput-object v0, Lh1/g;->a:Lh1/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Z)V
    .locals 0

    invoke-static {p0}, Lh1/g;->e(Z)V

    return-void
.end method

.method public static synthetic b(Z)V
    .locals 0

    invoke-static {p0}, Lh1/g;->g(Z)V

    return-void
.end method

.method public static synthetic c(Z)V
    .locals 0

    invoke-static {p0}, Lh1/g;->f(Z)V

    return-void
.end method

.method public static final d()V
    .locals 2

    sget-object v0, Lp0/f0;->a:Lp0/f0;

    invoke-static {}, Lp0/f0;->p()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lf1/n;->a:Lf1/n;

    sget-object v0, Lf1/n$b;->C:Lf1/n$b;

    sget-object v1, Lh1/d;->a:Lh1/d;

    invoke-static {v0, v1}, Lf1/n;->a(Lf1/n$b;Lf1/n$a;)V

    sget-object v0, Lf1/n$b;->F:Lf1/n$b;

    sget-object v1, Lh1/f;->a:Lh1/f;

    invoke-static {v0, v1}, Lf1/n;->a(Lf1/n$b;Lf1/n$a;)V

    sget-object v0, Lf1/n$b;->G:Lf1/n$b;

    sget-object v1, Lh1/e;->a:Lh1/e;

    invoke-static {v0, v1}, Lf1/n;->a(Lf1/n$b;Lf1/n$a;)V

    return-void
.end method

.method private static final e(Z)V
    .locals 0

    if-eqz p0, :cond_1

    sget-object p0, Lj1/c;->b:Lj1/c$a;

    invoke-virtual {p0}, Lj1/c$a;->c()V

    sget-object p0, Lf1/n;->a:Lf1/n;

    sget-object p0, Lf1/n$b;->D:Lf1/n$b;

    invoke-static {p0}, Lf1/n;->g(Lf1/n$b;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lh1/b;->a:Lh1/b;

    invoke-static {}, Lh1/b;->b()V

    sget-object p0, Lk1/a;->a:Lk1/a;

    invoke-static {}, Lk1/a;->a()V

    :cond_0
    sget-object p0, Lf1/n$b;->E:Lf1/n$b;

    invoke-static {p0}, Lf1/n;->g(Lf1/n$b;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lm1/a;->a:Lm1/a;

    invoke-static {}, Lm1/a;->a()V

    :cond_1
    return-void
.end method

.method private static final f(Z)V
    .locals 0

    if-eqz p0, :cond_0

    sget-object p0, Ll1/e;->a:Ll1/e;

    invoke-static {}, Ll1/e;->d()V

    :cond_0
    return-void
.end method

.method private static final g(Z)V
    .locals 0

    if-eqz p0, :cond_0

    sget-object p0, Li1/e;->a:Li1/e;

    invoke-static {}, Li1/e;->c()V

    :cond_0
    return-void
.end method
