.class final Ls1/t2$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/t2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field public final a:Lu2/u;

.field public final b:Lu2/u$c;

.field public final c:Ls1/t2$a;


# direct methods
.method public constructor <init>(Lu2/u;Lu2/u$c;Ls1/t2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/t2$b;->a:Lu2/u;

    iput-object p2, p0, Ls1/t2$b;->b:Lu2/u$c;

    iput-object p3, p0, Ls1/t2$b;->c:Ls1/t2$a;

    return-void
.end method
