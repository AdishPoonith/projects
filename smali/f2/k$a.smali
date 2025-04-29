.class final Lf2/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public final a:Lf2/o;

.field public final b:Lf2/r;

.field public final c:Lx1/e0;

.field public final d:Lx1/f0;

.field public e:I


# direct methods
.method public constructor <init>(Lf2/o;Lf2/r;Lx1/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf2/k$a;->a:Lf2/o;

    iput-object p2, p0, Lf2/k$a;->b:Lf2/r;

    iput-object p3, p0, Lf2/k$a;->c:Lx1/e0;

    iget-object p1, p1, Lf2/o;->f:Ls1/n1;

    iget-object p1, p1, Ls1/n1;->u:Ljava/lang/String;

    const-string p2, "audio/true-hd"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lx1/f0;

    invoke-direct {p1}, Lx1/f0;-><init>()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lf2/k$a;->d:Lx1/f0;

    return-void
.end method
