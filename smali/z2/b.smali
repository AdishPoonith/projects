.class public final Lz2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/j;


# static fields
.field private static final d:Lx1/a0;


# instance fields
.field final a:Lx1/l;

.field private final b:Ls1/n1;

.field private final c:Lp3/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx1/a0;

    invoke-direct {v0}, Lx1/a0;-><init>()V

    sput-object v0, Lz2/b;->d:Lx1/a0;

    return-void
.end method

.method public constructor <init>(Lx1/l;Ls1/n1;Lp3/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/b;->a:Lx1/l;

    iput-object p2, p0, Lz2/b;->b:Ls1/n1;

    iput-object p3, p0, Lz2/b;->c:Lp3/j0;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Lz2/b;->a:Lx1/l;

    instance-of v1, v0, Lh2/h;

    if-nez v1, :cond_1

    instance-of v1, v0, Lh2/b;

    if-nez v1, :cond_1

    instance-of v1, v0, Lh2/e;

    if-nez v1, :cond_1

    instance-of v0, v0, Le2/f;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public b(Lx1/m;)Z
    .locals 2

    iget-object v0, p0, Lz2/b;->a:Lx1/l;

    sget-object v1, Lz2/b;->d:Lx1/a0;

    invoke-interface {v0, p1, v1}, Lx1/l;->i(Lx1/m;Lx1/a0;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public c(Lx1/n;)V
    .locals 1

    iget-object v0, p0, Lz2/b;->a:Lx1/l;

    invoke-interface {v0, p1}, Lx1/l;->c(Lx1/n;)V

    return-void
.end method

.method public d()V
    .locals 3

    iget-object v0, p0, Lz2/b;->a:Lx1/l;

    const-wide/16 v1, 0x0

    invoke-interface {v0, v1, v2, v1, v2}, Lx1/l;->b(JJ)V

    return-void
.end method

.method public e()Z
    .locals 2

    iget-object v0, p0, Lz2/b;->a:Lx1/l;

    instance-of v1, v0, Lh2/h0;

    if-nez v1, :cond_1

    instance-of v0, v0, Lf2/g;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public f()Lz2/j;
    .locals 4

    invoke-virtual {p0}, Lz2/b;->e()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-object v0, p0, Lz2/b;->a:Lx1/l;

    instance-of v1, v0, Lz2/t;

    if-eqz v1, :cond_0

    new-instance v0, Lz2/t;

    iget-object v1, p0, Lz2/b;->b:Ls1/n1;

    iget-object v1, v1, Ls1/n1;->l:Ljava/lang/String;

    iget-object v2, p0, Lz2/b;->c:Lp3/j0;

    invoke-direct {v0, v1, v2}, Lz2/t;-><init>(Ljava/lang/String;Lp3/j0;)V

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lh2/h;

    if-eqz v1, :cond_1

    new-instance v0, Lh2/h;

    invoke-direct {v0}, Lh2/h;-><init>()V

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lh2/b;

    if-eqz v1, :cond_2

    new-instance v0, Lh2/b;

    invoke-direct {v0}, Lh2/b;-><init>()V

    goto :goto_0

    :cond_2
    instance-of v1, v0, Lh2/e;

    if-eqz v1, :cond_3

    new-instance v0, Lh2/e;

    invoke-direct {v0}, Lh2/e;-><init>()V

    goto :goto_0

    :cond_3
    instance-of v0, v0, Le2/f;

    if-eqz v0, :cond_4

    new-instance v0, Le2/f;

    invoke-direct {v0}, Le2/f;-><init>()V

    :goto_0
    new-instance v1, Lz2/b;

    iget-object v2, p0, Lz2/b;->b:Ls1/n1;

    iget-object v3, p0, Lz2/b;->c:Lp3/j0;

    invoke-direct {v1, v0, v2, v3}, Lz2/b;-><init>(Lx1/l;Ls1/n1;Lp3/j0;)V

    return-object v1

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected extractor type for recreation: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz2/b;->a:Lx1/l;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
