.class Lio/flutter/view/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq8/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/view/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/flutter/view/c;


# direct methods
.method constructor <init>(Lio/flutter/view/c;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/view/c$a;->a:Lio/flutter/view/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/view/c$a;->a:Lio/flutter/view/c;

    invoke-static {v0}, Lio/flutter/view/c;->c(Lio/flutter/view/c;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public b(Ljava/nio/ByteBuffer;[Ljava/lang/String;[Ljava/nio/ByteBuffer;)V
    .locals 4

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    array-length v0, p3

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p3, v1

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/view/c$a;->a:Lio/flutter/view/c;

    invoke-virtual {v0, p1, p2, p3}, Lio/flutter/view/c;->b0(Ljava/nio/ByteBuffer;[Ljava/lang/String;[Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public c(Ljava/nio/ByteBuffer;[Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lio/flutter/view/c$a;->a:Lio/flutter/view/c;

    invoke-virtual {v0, p1, p2}, Lio/flutter/view/c;->a0(Ljava/nio/ByteBuffer;[Ljava/lang/String;)V

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/view/c$a;->a:Lio/flutter/view/c;

    const/4 v1, 0x0

    const/16 v2, 0x20

    invoke-static {v0, v1, v2}, Lio/flutter/view/c;->k(Lio/flutter/view/c;II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/flutter/view/c$a;->a:Lio/flutter/view/c;

    invoke-static {p1, v0}, Lio/flutter/view/c;->l(Lio/flutter/view/c;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public e(I)V
    .locals 2

    iget-object v0, p0, Lio/flutter/view/c$a;->a:Lio/flutter/view/c;

    const/4 v1, 0x2

    invoke-static {v0, p1, v1}, Lio/flutter/view/c;->j(Lio/flutter/view/c;II)V

    return-void
.end method

.method public f(I)V
    .locals 2

    iget-object v0, p0, Lio/flutter/view/c$a;->a:Lio/flutter/view/c;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lio/flutter/view/c;->j(Lio/flutter/view/c;II)V

    return-void
.end method
