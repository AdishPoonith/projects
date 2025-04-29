.class public final Lq9/d;
.super Lq9/a;
.source "SourceFile"


# static fields
.field static final l:Li9/r0$i;


# instance fields
.field private final c:Li9/r0;

.field private final d:Li9/r0$d;

.field private e:Li9/r0$c;

.field private f:Li9/r0;

.field private g:Li9/r0$c;

.field private h:Li9/r0;

.field private i:Li9/p;

.field private j:Li9/r0$i;

.field private k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq9/d$c;

    invoke-direct {v0}, Lq9/d$c;-><init>()V

    sput-object v0, Lq9/d;->l:Li9/r0$i;

    return-void
.end method

.method public constructor <init>(Li9/r0$d;)V
    .locals 1

    invoke-direct {p0}, Lq9/a;-><init>()V

    new-instance v0, Lq9/d$a;

    invoke-direct {v0, p0}, Lq9/d$a;-><init>(Lq9/d;)V

    iput-object v0, p0, Lq9/d;->c:Li9/r0;

    iput-object v0, p0, Lq9/d;->f:Li9/r0;

    iput-object v0, p0, Lq9/d;->h:Li9/r0;

    const-string v0, "helper"

    invoke-static {p1, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li9/r0$d;

    iput-object p1, p0, Lq9/d;->d:Li9/r0$d;

    return-void
.end method

.method static synthetic h(Lq9/d;)Li9/r0$d;
    .locals 0

    iget-object p0, p0, Lq9/d;->d:Li9/r0$d;

    return-object p0
.end method

.method static synthetic i(Lq9/d;)Li9/r0;
    .locals 0

    iget-object p0, p0, Lq9/d;->h:Li9/r0;

    return-object p0
.end method

.method static synthetic j(Lq9/d;)Z
    .locals 0

    iget-boolean p0, p0, Lq9/d;->k:Z

    return p0
.end method

.method static synthetic k(Lq9/d;Z)Z
    .locals 0

    iput-boolean p1, p0, Lq9/d;->k:Z

    return p1
.end method

.method static synthetic l(Lq9/d;Li9/p;)Li9/p;
    .locals 0

    iput-object p1, p0, Lq9/d;->i:Li9/p;

    return-object p1
.end method

.method static synthetic m(Lq9/d;Li9/r0$i;)Li9/r0$i;
    .locals 0

    iput-object p1, p0, Lq9/d;->j:Li9/r0$i;

    return-object p1
.end method

.method static synthetic n(Lq9/d;)V
    .locals 0

    invoke-direct {p0}, Lq9/d;->q()V

    return-void
.end method

.method static synthetic o(Lq9/d;)Li9/r0;
    .locals 0

    iget-object p0, p0, Lq9/d;->f:Li9/r0;

    return-object p0
.end method

.method static synthetic p(Lq9/d;)Li9/r0;
    .locals 0

    iget-object p0, p0, Lq9/d;->c:Li9/r0;

    return-object p0
.end method

.method private q()V
    .locals 3

    iget-object v0, p0, Lq9/d;->d:Li9/r0$d;

    iget-object v1, p0, Lq9/d;->i:Li9/p;

    iget-object v2, p0, Lq9/d;->j:Li9/r0$i;

    invoke-virtual {v0, v1, v2}, Li9/r0$d;->f(Li9/p;Li9/r0$i;)V

    iget-object v0, p0, Lq9/d;->f:Li9/r0;

    invoke-virtual {v0}, Li9/r0;->f()V

    iget-object v0, p0, Lq9/d;->h:Li9/r0;

    iput-object v0, p0, Lq9/d;->f:Li9/r0;

    iget-object v0, p0, Lq9/d;->g:Li9/r0$c;

    iput-object v0, p0, Lq9/d;->e:Li9/r0$c;

    iget-object v0, p0, Lq9/d;->c:Li9/r0;

    iput-object v0, p0, Lq9/d;->h:Li9/r0;

    const/4 v0, 0x0

    iput-object v0, p0, Lq9/d;->g:Li9/r0$c;

    return-void
.end method


# virtual methods
.method public f()V
    .locals 1

    iget-object v0, p0, Lq9/d;->h:Li9/r0;

    invoke-virtual {v0}, Li9/r0;->f()V

    iget-object v0, p0, Lq9/d;->f:Li9/r0;

    invoke-virtual {v0}, Li9/r0;->f()V

    return-void
.end method

.method protected g()Li9/r0;
    .locals 2

    iget-object v0, p0, Lq9/d;->h:Li9/r0;

    iget-object v1, p0, Lq9/d;->c:Li9/r0;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lq9/d;->f:Li9/r0;

    :cond_0
    return-object v0
.end method

.method public r(Li9/r0$c;)V
    .locals 2

    const-string v0, "newBalancerFactory"

    invoke-static {p1, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lq9/d;->g:Li9/r0$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lq9/d;->h:Li9/r0;

    invoke-virtual {v0}, Li9/r0;->f()V

    iget-object v0, p0, Lq9/d;->c:Li9/r0;

    iput-object v0, p0, Lq9/d;->h:Li9/r0;

    const/4 v0, 0x0

    iput-object v0, p0, Lq9/d;->g:Li9/r0$c;

    sget-object v0, Li9/p;->j:Li9/p;

    iput-object v0, p0, Lq9/d;->i:Li9/p;

    sget-object v0, Lq9/d;->l:Li9/r0$i;

    iput-object v0, p0, Lq9/d;->j:Li9/r0$i;

    iget-object v0, p0, Lq9/d;->e:Li9/r0$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Lq9/d$b;

    invoke-direct {v0, p0}, Lq9/d$b;-><init>(Lq9/d;)V

    invoke-virtual {p1, v0}, Li9/r0$c;->a(Li9/r0$d;)Li9/r0;

    move-result-object v1

    iput-object v1, v0, Lq9/d$b;->a:Li9/r0;

    iput-object v1, p0, Lq9/d;->h:Li9/r0;

    iput-object p1, p0, Lq9/d;->g:Li9/r0$c;

    iget-boolean p1, p0, Lq9/d;->k:Z

    if-nez p1, :cond_2

    invoke-direct {p0}, Lq9/d;->q()V

    :cond_2
    return-void
.end method
