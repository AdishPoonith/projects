.class public final Ls9/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls9/r$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Ls9/r;",
        ">;"
    }
.end annotation


# static fields
.field public static final j:Ls9/r$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls9/r$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls9/r$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Ls9/r;->j:Ls9/r$a;

    return-void
.end method

.method public static b(I)I
    .locals 0

    return p0
.end method
