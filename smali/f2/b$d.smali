.class final Lf2/b$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field public final a:[Lf2/p;

.field public b:Ls1/n1;

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array p1, p1, [Lf2/p;

    iput-object p1, p0, Lf2/b$d;->a:[Lf2/p;

    const/4 p1, 0x0

    iput p1, p0, Lf2/b$d;->d:I

    return-void
.end method
