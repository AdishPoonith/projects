.class final Lg2/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/b0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lg2/a;


# direct methods
.method private constructor <init>(Lg2/a;)V
    .locals 0

    iput-object p1, p0, Lg2/a$b;->a:Lg2/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lg2/a;Lg2/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lg2/a$b;-><init>(Lg2/a;)V

    return-void
.end method


# virtual methods
.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public g(J)Lx1/b0$a;
    .locals 10

    iget-object v0, p0, Lg2/a$b;->a:Lg2/a;

    invoke-static {v0}, Lg2/a;->d(Lg2/a;)Lg2/i;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lg2/i;->c(J)J

    move-result-wide v0

    iget-object v2, p0, Lg2/a$b;->a:Lg2/a;

    invoke-static {v2}, Lg2/a;->e(Lg2/a;)J

    move-result-wide v2

    iget-object v4, p0, Lg2/a$b;->a:Lg2/a;

    invoke-static {v4}, Lg2/a;->f(Lg2/a;)J

    move-result-wide v4

    iget-object v6, p0, Lg2/a$b;->a:Lg2/a;

    invoke-static {v6}, Lg2/a;->e(Lg2/a;)J

    move-result-wide v6

    sub-long/2addr v4, v6

    mul-long v0, v0, v4

    iget-object v4, p0, Lg2/a$b;->a:Lg2/a;

    invoke-static {v4}, Lg2/a;->g(Lg2/a;)J

    move-result-wide v4

    div-long/2addr v0, v4

    add-long/2addr v2, v0

    const-wide/16 v0, 0x7530

    sub-long v4, v2, v0

    iget-object v0, p0, Lg2/a$b;->a:Lg2/a;

    invoke-static {v0}, Lg2/a;->e(Lg2/a;)J

    move-result-wide v6

    iget-object v0, p0, Lg2/a$b;->a:Lg2/a;

    invoke-static {v0}, Lg2/a;->f(Lg2/a;)J

    move-result-wide v0

    const-wide/16 v2, 0x1

    sub-long v8, v0, v2

    invoke-static/range {v4 .. v9}, Lp3/n0;->r(JJJ)J

    move-result-wide v0

    new-instance v2, Lx1/b0$a;

    new-instance v3, Lx1/c0;

    invoke-direct {v3, p1, p2, v0, v1}, Lx1/c0;-><init>(JJ)V

    invoke-direct {v2, v3}, Lx1/b0$a;-><init>(Lx1/c0;)V

    return-object v2
.end method

.method public h()J
    .locals 3

    iget-object v0, p0, Lg2/a$b;->a:Lg2/a;

    invoke-static {v0}, Lg2/a;->d(Lg2/a;)Lg2/i;

    move-result-object v0

    iget-object v1, p0, Lg2/a$b;->a:Lg2/a;

    invoke-static {v1}, Lg2/a;->g(Lg2/a;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lg2/i;->b(J)J

    move-result-wide v0

    return-wide v0
.end method
