.class final Lu2/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lu2/u;

.field public final b:Lu2/u$c;

.field public final c:Lu2/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu2/f<",
            "TT;>.a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lu2/u;Lu2/u$c;Lu2/f$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/u;",
            "Lu2/u$c;",
            "Lu2/f<",
            "TT;>.a;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/f$b;->a:Lu2/u;

    iput-object p2, p0, Lu2/f$b;->b:Lu2/u$c;

    iput-object p3, p0, Lu2/f$b;->c:Lu2/f$a;

    return-void
.end method
