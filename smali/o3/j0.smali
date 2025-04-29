.class public final Lo3/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo3/h0$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo3/j0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lo3/h0$e;"
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:Lo3/p;

.field public final c:I

.field private final d:Lo3/o0;

.field private final e:Lo3/j0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo3/j0$a<",
            "+TT;>;"
        }
    .end annotation
.end field

.field private volatile f:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo3/l;Landroid/net/Uri;ILo3/j0$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo3/l;",
            "Landroid/net/Uri;",
            "I",
            "Lo3/j0$a<",
            "+TT;>;)V"
        }
    .end annotation

    new-instance v0, Lo3/p$b;

    invoke-direct {v0}, Lo3/p$b;-><init>()V

    invoke-virtual {v0, p2}, Lo3/p$b;->i(Landroid/net/Uri;)Lo3/p$b;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lo3/p$b;->b(I)Lo3/p$b;

    move-result-object p2

    invoke-virtual {p2}, Lo3/p$b;->a()Lo3/p;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3, p4}, Lo3/j0;-><init>(Lo3/l;Lo3/p;ILo3/j0$a;)V

    return-void
.end method

.method public constructor <init>(Lo3/l;Lo3/p;ILo3/j0$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo3/l;",
            "Lo3/p;",
            "I",
            "Lo3/j0$a<",
            "+TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo3/o0;

    invoke-direct {v0, p1}, Lo3/o0;-><init>(Lo3/l;)V

    iput-object v0, p0, Lo3/j0;->d:Lo3/o0;

    iput-object p2, p0, Lo3/j0;->b:Lo3/p;

    iput p3, p0, Lo3/j0;->c:I

    iput-object p4, p0, Lo3/j0;->e:Lo3/j0$a;

    invoke-static {}, Lu2/n;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lo3/j0;->a:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Lo3/j0;->d:Lo3/o0;

    invoke-virtual {v0}, Lo3/o0;->q()J

    move-result-wide v0

    return-wide v0
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lo3/j0;->d:Lo3/o0;

    invoke-virtual {v0}, Lo3/o0;->t()V

    new-instance v0, Lo3/n;

    iget-object v1, p0, Lo3/j0;->d:Lo3/o0;

    iget-object v2, p0, Lo3/j0;->b:Lo3/p;

    invoke-direct {v0, v1, v2}, Lo3/n;-><init>(Lo3/l;Lo3/p;)V

    :try_start_0
    invoke-virtual {v0}, Lo3/n;->b()V

    iget-object v1, p0, Lo3/j0;->d:Lo3/o0;

    invoke-virtual {v1}, Lo3/o0;->j()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/Uri;

    iget-object v2, p0, Lo3/j0;->e:Lo3/j0$a;

    invoke-interface {v2, v1, v0}, Lo3/j0$a;->a(Landroid/net/Uri;Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lo3/j0;->f:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Lp3/n0;->n(Ljava/io/Closeable;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-static {v0}, Lp3/n0;->n(Ljava/io/Closeable;)V

    throw v1
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public d()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lo3/j0;->d:Lo3/o0;

    invoke-virtual {v0}, Lo3/o0;->s()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lo3/j0;->f:Ljava/lang/Object;

    return-object v0
.end method

.method public f()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lo3/j0;->d:Lo3/o0;

    invoke-virtual {v0}, Lo3/o0;->r()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
