.class final Lf2/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public final a:J

.field public final b:Z

.field public final c:I


# direct methods
.method public constructor <init>(JZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lf2/g$a;->a:J

    iput-boolean p3, p0, Lf2/g$a;->b:Z

    iput p4, p0, Lf2/g$a;->c:I

    return-void
.end method
