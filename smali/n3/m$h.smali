.class abstract Ln3/m$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln3/m$h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ln3/m$h<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final j:I

.field public final k:Lu2/t0;

.field public final l:I

.field public final m:Ls1/n1;


# direct methods
.method public constructor <init>(ILu2/t0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ln3/m$h;->j:I

    iput-object p2, p0, Ln3/m$h;->k:Lu2/t0;

    iput p3, p0, Ln3/m$h;->l:I

    invoke-virtual {p2, p3}, Lu2/t0;->b(I)Ls1/n1;

    move-result-object p1

    iput-object p1, p0, Ln3/m$h;->m:Ls1/n1;

    return-void
.end method


# virtual methods
.method public abstract b()I
.end method

.method public abstract g(Ln3/m$h;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation
.end method
