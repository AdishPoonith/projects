.class public Lp6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp6/g0;


# static fields
.field private static final d:Li9/y0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/y0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Li9/y0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/y0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final f:Li9/y0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/y0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ls6/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls6/b<",
            "Lr6/j;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ls6/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls6/b<",
            "Lv6/i;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lw5/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Li9/y0;->e:Li9/y0$d;

    const-string v1, "x-firebase-client-log-type"

    invoke-static {v1, v0}, Li9/y0$g;->e(Ljava/lang/String;Li9/y0$d;)Li9/y0$g;

    move-result-object v1

    sput-object v1, Lp6/q;->d:Li9/y0$g;

    const-string v1, "x-firebase-client"

    invoke-static {v1, v0}, Li9/y0$g;->e(Ljava/lang/String;Li9/y0$d;)Li9/y0$g;

    move-result-object v1

    sput-object v1, Lp6/q;->e:Li9/y0$g;

    const-string v1, "x-firebase-gmpid"

    invoke-static {v1, v0}, Li9/y0$g;->e(Ljava/lang/String;Li9/y0$d;)Li9/y0$g;

    move-result-object v0

    sput-object v0, Lp6/q;->f:Li9/y0$g;

    return-void
.end method

.method public constructor <init>(Ls6/b;Ls6/b;Lw5/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls6/b<",
            "Lv6/i;",
            ">;",
            "Ls6/b<",
            "Lr6/j;",
            ">;",
            "Lw5/n;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/q;->b:Ls6/b;

    iput-object p2, p0, Lp6/q;->a:Ls6/b;

    iput-object p3, p0, Lp6/q;->c:Lw5/n;

    return-void
.end method

.method private b(Li9/y0;)V
    .locals 2

    iget-object v0, p0, Lp6/q;->c:Lw5/n;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lw5/n;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lp6/q;->f:Li9/y0$g;

    invoke-virtual {p1, v1, v0}, Li9/y0;->p(Li9/y0$g;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public a(Li9/y0;)V
    .locals 2

    iget-object v0, p0, Lp6/q;->a:Ls6/b;

    invoke-interface {v0}, Ls6/b;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lp6/q;->b:Ls6/b;

    invoke-interface {v0}, Ls6/b;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp6/q;->a:Ls6/b;

    invoke-interface {v0}, Ls6/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr6/j;

    const-string v1, "fire-fst"

    invoke-interface {v0, v1}, Lr6/j;->b(Ljava/lang/String;)Lr6/j$a;

    move-result-object v0

    invoke-virtual {v0}, Lr6/j$a;->b()I

    move-result v0

    if-eqz v0, :cond_1

    sget-object v1, Lp6/q;->d:Li9/y0$g;

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Li9/y0;->p(Li9/y0$g;Ljava/lang/Object;)V

    :cond_1
    sget-object v0, Lp6/q;->e:Li9/y0$g;

    iget-object v1, p0, Lp6/q;->b:Ls6/b;

    invoke-interface {v1}, Ls6/b;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv6/i;

    invoke-interface {v1}, Lv6/i;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Li9/y0;->p(Li9/y0$g;Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lp6/q;->b(Li9/y0;)V

    :cond_2
    :goto_0
    return-void
.end method
