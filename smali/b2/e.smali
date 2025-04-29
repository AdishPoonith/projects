.class abstract Lb2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb2/e$a;
    }
.end annotation


# instance fields
.field protected final a:Lx1/e0;


# direct methods
.method protected constructor <init>(Lx1/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/e;->a:Lx1/e0;

    return-void
.end method


# virtual methods
.method public final a(Lp3/a0;J)Z
    .locals 1

    invoke-virtual {p0, p1}, Lb2/e;->b(Lp3/a0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lb2/e;->c(Lp3/a0;J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected abstract b(Lp3/a0;)Z
.end method

.method protected abstract c(Lp3/a0;J)Z
.end method
