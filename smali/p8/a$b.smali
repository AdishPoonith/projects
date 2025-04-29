.class public final Lp8/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Landroid/graphics/Rect;

.field public final b:Lp8/a$d;

.field public final c:Lp8/a$c;


# direct methods
.method public constructor <init>(Landroid/graphics/Rect;Lp8/a$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp8/a$b;->a:Landroid/graphics/Rect;

    iput-object p2, p0, Lp8/a$b;->b:Lp8/a$d;

    sget-object p1, Lp8/a$c;->k:Lp8/a$c;

    iput-object p1, p0, Lp8/a$b;->c:Lp8/a$c;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Rect;Lp8/a$d;Lp8/a$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp8/a$b;->a:Landroid/graphics/Rect;

    iput-object p2, p0, Lp8/a$b;->b:Lp8/a$d;

    iput-object p3, p0, Lp8/a$b;->c:Lp8/a$c;

    return-void
.end method
