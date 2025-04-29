.class public Ly2/j$b;
.super Ly2/j;
.source "SourceFile"

# interfaces
.implements Lx2/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field final i:Ly2/k$a;


# direct methods
.method public constructor <init>(JLs1/n1;Ljava/util/List;Ly2/k$a;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ls1/n1;",
            "Ljava/util/List<",
            "Ly2/b;",
            ">;",
            "Ly2/k$a;",
            "Ljava/util/List<",
            "Ly2/e;",
            ">;",
            "Ljava/util/List<",
            "Ly2/e;",
            ">;",
            "Ljava/util/List<",
            "Ly2/e;",
            ">;)V"
        }
    .end annotation

    const/4 v9, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Ly2/j;-><init>(JLs1/n1;Ljava/util/List;Ly2/k;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ly2/j$a;)V

    move-object v1, p5

    iput-object v1, v0, Ly2/j$b;->i:Ly2/k$a;

    return-void
.end method


# virtual methods
.method public a(JJ)J
    .locals 1

    iget-object v0, p0, Ly2/j$b;->i:Ly2/k$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Ly2/k$a;->i(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(JJ)J
    .locals 1

    iget-object v0, p0, Ly2/j$b;->i:Ly2/k$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Ly2/k$a;->h(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public c(JJ)J
    .locals 1

    iget-object v0, p0, Ly2/j$b;->i:Ly2/k$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Ly2/k$a;->d(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public d(J)J
    .locals 1

    iget-object v0, p0, Ly2/j$b;->i:Ly2/k$a;

    invoke-virtual {v0, p1, p2}, Ly2/k$a;->j(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public e(JJ)J
    .locals 1

    iget-object v0, p0, Ly2/j$b;->i:Ly2/k$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Ly2/k$a;->f(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public f(J)Ly2/i;
    .locals 1

    iget-object v0, p0, Ly2/j$b;->i:Ly2/k$a;

    invoke-virtual {v0, p0, p1, p2}, Ly2/k$a;->k(Ly2/j;J)Ly2/i;

    move-result-object p1

    return-object p1
.end method

.method public g()Z
    .locals 1

    iget-object v0, p0, Ly2/j$b;->i:Ly2/k$a;

    invoke-virtual {v0}, Ly2/k$a;->l()Z

    move-result v0

    return v0
.end method

.method public h()J
    .locals 2

    iget-object v0, p0, Ly2/j$b;->i:Ly2/k$a;

    invoke-virtual {v0}, Ly2/k$a;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public i(J)J
    .locals 1

    iget-object v0, p0, Ly2/j$b;->i:Ly2/k$a;

    invoke-virtual {v0, p1, p2}, Ly2/k$a;->g(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public j(JJ)J
    .locals 1

    iget-object v0, p0, Ly2/j$b;->i:Ly2/k$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Ly2/k$a;->c(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public k()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public l()Lx2/f;
    .locals 0

    return-object p0
.end method

.method public m()Ly2/i;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
