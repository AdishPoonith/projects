.class final La2/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Lx1/v;

.field private final b:I

.field private final c:Lx1/s$a;


# direct methods
.method private constructor <init>(Lx1/v;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La2/b$b;->a:Lx1/v;

    iput p2, p0, La2/b$b;->b:I

    new-instance p1, Lx1/s$a;

    invoke-direct {p1}, Lx1/s$a;-><init>()V

    iput-object p1, p0, La2/b$b;->c:Lx1/s$a;

    return-void
.end method

.method synthetic constructor <init>(Lx1/v;ILa2/b$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, La2/b$b;-><init>(Lx1/v;I)V

    return-void
.end method

.method private c(Lx1/m;)J
    .locals 7

    :goto_0
    invoke-interface {p1}, Lx1/m;->l()J

    move-result-wide v0

    invoke-interface {p1}, Lx1/m;->a()J

    move-result-wide v2

    const-wide/16 v4, 0x6

    sub-long/2addr v2, v4

    cmp-long v6, v0, v2

    if-gez v6, :cond_0

    iget-object v0, p0, La2/b$b;->a:Lx1/v;

    iget v1, p0, La2/b$b;->b:I

    iget-object v2, p0, La2/b$b;->c:Lx1/s$a;

    invoke-static {p1, v0, v1, v2}, Lx1/s;->h(Lx1/m;Lx1/v;ILx1/s$a;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lx1/m;->o(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lx1/m;->l()J

    move-result-wide v0

    invoke-interface {p1}, Lx1/m;->a()J

    move-result-wide v2

    sub-long/2addr v2, v4

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    invoke-interface {p1}, Lx1/m;->a()J

    move-result-wide v0

    invoke-interface {p1}, Lx1/m;->l()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v1, v0

    invoke-interface {p1, v1}, Lx1/m;->o(I)V

    iget-object p1, p0, La2/b$b;->a:Lx1/v;

    iget-wide v0, p1, Lx1/v;->j:J

    return-wide v0

    :cond_1
    iget-object p1, p0, La2/b$b;->c:Lx1/s$a;

    iget-wide v0, p1, Lx1/s$a;->a:J

    return-wide v0
.end method


# virtual methods
.method public a(Lx1/m;J)Lx1/a$e;
    .locals 10

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v0

    invoke-direct {p0, p1}, La2/b$b;->c(Lx1/m;)J

    move-result-wide v2

    invoke-interface {p1}, Lx1/m;->l()J

    move-result-wide v4

    iget-object v6, p0, La2/b$b;->a:Lx1/v;

    iget v6, v6, Lx1/v;->c:I

    const/4 v7, 0x6

    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-interface {p1, v6}, Lx1/m;->o(I)V

    invoke-direct {p0, p1}, La2/b$b;->c(Lx1/m;)J

    move-result-wide v6

    invoke-interface {p1}, Lx1/m;->l()J

    move-result-wide v8

    cmp-long p1, v2, p2

    if-gtz p1, :cond_0

    cmp-long p1, v6, p2

    if-lez p1, :cond_0

    invoke-static {v4, v5}, Lx1/a$e;->e(J)Lx1/a$e;

    move-result-object p1

    return-object p1

    :cond_0
    cmp-long p1, v6, p2

    if-gtz p1, :cond_1

    invoke-static {v6, v7, v8, v9}, Lx1/a$e;->f(JJ)Lx1/a$e;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {v2, v3, v0, v1}, Lx1/a$e;->d(JJ)Lx1/a$e;

    move-result-object p1

    return-object p1
.end method

.method public synthetic b()V
    .locals 0

    invoke-static {p0}, Lx1/b;->a(Lx1/a$f;)V

    return-void
.end method
