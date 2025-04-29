.class public abstract Lo3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo3/l;


# instance fields
.field private final a:Z

.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lo3/p0;",
            ">;"
        }
    .end annotation
.end field

.field private c:I

.field private d:Lo3/p;


# direct methods
.method protected constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lo3/g;->a:Z

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lo3/g;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public synthetic e()Ljava/util/Map;
    .locals 1

    invoke-static {p0}, Lo3/k;->a(Lo3/l;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final h(Lo3/p0;)V
    .locals 1

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lo3/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo3/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget p1, p0, Lo3/g;->c:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lo3/g;->c:I

    :cond_0
    return-void
.end method

.method protected final q(I)V
    .locals 4

    iget-object v0, p0, Lo3/g;->d:Lo3/p;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo3/p;

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lo3/g;->c:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lo3/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo3/p0;

    iget-boolean v3, p0, Lo3/g;->a:Z

    invoke-interface {v2, p0, v0, v3, p1}, Lo3/p0;->e(Lo3/l;Lo3/p;ZI)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected final r()V
    .locals 4

    iget-object v0, p0, Lo3/g;->d:Lo3/p;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo3/p;

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lo3/g;->c:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lo3/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo3/p0;

    iget-boolean v3, p0, Lo3/g;->a:Z

    invoke-interface {v2, p0, v0, v3}, Lo3/p0;->c(Lo3/l;Lo3/p;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo3/g;->d:Lo3/p;

    return-void
.end method

.method protected final s(Lo3/p;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lo3/g;->c:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lo3/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo3/p0;

    iget-boolean v2, p0, Lo3/g;->a:Z

    invoke-interface {v1, p0, p1, v2}, Lo3/p0;->b(Lo3/l;Lo3/p;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected final t(Lo3/p;)V
    .locals 3

    iput-object p1, p0, Lo3/g;->d:Lo3/p;

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lo3/g;->c:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lo3/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo3/p0;

    iget-boolean v2, p0, Lo3/g;->a:Z

    invoke-interface {v1, p0, p1, v2}, Lo3/p0;->h(Lo3/l;Lo3/p;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
