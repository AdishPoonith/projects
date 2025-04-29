.class public Lq8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq8/a$b;
    }
.end annotation


# instance fields
.field public final a:Lr8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr8/a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lio/flutter/embedding/engine/FlutterJNI;

.field private c:Lq8/a$b;

.field final d:Lr8/a$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr8/a$d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le8/a;Lio/flutter/embedding/engine/FlutterJNI;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lq8/a$a;

    invoke-direct {v0, p0}, Lq8/a$a;-><init>(Lq8/a;)V

    iput-object v0, p0, Lq8/a;->d:Lr8/a$d;

    new-instance v1, Lr8/a;

    sget-object v2, Lr8/r;->a:Lr8/r;

    const-string v3, "flutter/accessibility"

    invoke-direct {v1, p1, v3, v2}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    iput-object v1, p0, Lq8/a;->a:Lr8/a;

    invoke-virtual {v1, v0}, Lr8/a;->e(Lr8/a$d;)V

    iput-object p2, p0, Lq8/a;->b:Lio/flutter/embedding/engine/FlutterJNI;

    return-void
.end method

.method static synthetic a(Lq8/a;)Lq8/a$b;
    .locals 0

    iget-object p0, p0, Lq8/a;->c:Lq8/a$b;

    return-object p0
.end method


# virtual methods
.method public b(ILio/flutter/view/c$g;)V
    .locals 1

    iget-object v0, p0, Lq8/a;->b:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0, p1, p2}, Lio/flutter/embedding/engine/FlutterJNI;->dispatchSemanticsAction(ILio/flutter/view/c$g;)V

    return-void
.end method

.method public c(ILio/flutter/view/c$g;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lq8/a;->b:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0, p1, p2, p3}, Lio/flutter/embedding/engine/FlutterJNI;->dispatchSemanticsAction(ILio/flutter/view/c$g;Ljava/lang/Object;)V

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lq8/a;->b:Lio/flutter/embedding/engine/FlutterJNI;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setSemanticsEnabled(Z)V

    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lq8/a;->b:Lio/flutter/embedding/engine/FlutterJNI;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setSemanticsEnabled(Z)V

    return-void
.end method

.method public f(I)V
    .locals 1

    iget-object v0, p0, Lq8/a;->b:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0, p1}, Lio/flutter/embedding/engine/FlutterJNI;->setAccessibilityFeatures(I)V

    return-void
.end method

.method public g(Lq8/a$b;)V
    .locals 1

    iput-object p1, p0, Lq8/a;->c:Lq8/a$b;

    iget-object v0, p0, Lq8/a;->b:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0, p1}, Lio/flutter/embedding/engine/FlutterJNI;->setAccessibilityDelegate(Lio/flutter/embedding/engine/FlutterJNI$a;)V

    return-void
.end method
