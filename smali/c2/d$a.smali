.class Lc2/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/b0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc2/d;->t(Lx1/b0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx1/b0;

.field final synthetic b:Lc2/d;


# direct methods
.method constructor <init>(Lc2/d;Lx1/b0;)V
    .locals 0

    iput-object p1, p0, Lc2/d$a;->b:Lc2/d;

    iput-object p2, p0, Lc2/d$a;->a:Lx1/b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public f()Z
    .locals 1

    iget-object v0, p0, Lc2/d$a;->a:Lx1/b0;

    invoke-interface {v0}, Lx1/b0;->f()Z

    move-result v0

    return v0
.end method

.method public g(J)Lx1/b0$a;
    .locals 8

    iget-object v0, p0, Lc2/d$a;->a:Lx1/b0;

    invoke-interface {v0, p1, p2}, Lx1/b0;->g(J)Lx1/b0$a;

    move-result-object p1

    new-instance p2, Lx1/b0$a;

    new-instance v0, Lx1/c0;

    iget-object v1, p1, Lx1/b0$a;->a:Lx1/c0;

    iget-wide v2, v1, Lx1/c0;->a:J

    iget-wide v4, v1, Lx1/c0;->b:J

    iget-object v1, p0, Lc2/d$a;->b:Lc2/d;

    invoke-static {v1}, Lc2/d;->a(Lc2/d;)J

    move-result-wide v6

    add-long/2addr v4, v6

    invoke-direct {v0, v2, v3, v4, v5}, Lx1/c0;-><init>(JJ)V

    new-instance v1, Lx1/c0;

    iget-object p1, p1, Lx1/b0$a;->b:Lx1/c0;

    iget-wide v2, p1, Lx1/c0;->a:J

    iget-wide v4, p1, Lx1/c0;->b:J

    iget-object p1, p0, Lc2/d$a;->b:Lc2/d;

    invoke-static {p1}, Lc2/d;->a(Lc2/d;)J

    move-result-wide v6

    add-long/2addr v4, v6

    invoke-direct {v1, v2, v3, v4, v5}, Lx1/c0;-><init>(JJ)V

    invoke-direct {p2, v0, v1}, Lx1/b0$a;-><init>(Lx1/c0;Lx1/c0;)V

    return-object p2
.end method

.method public h()J
    .locals 2

    iget-object v0, p0, Lc2/d$a;->a:Lx1/b0;

    invoke-interface {v0}, Lx1/b0;->h()J

    move-result-wide v0

    return-wide v0
.end method
