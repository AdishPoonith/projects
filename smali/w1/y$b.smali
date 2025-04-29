.class public interface abstract Lw1/y$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "b"
.end annotation


# static fields
.field public static final a:Lw1/y$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lw1/z;->b:Lw1/z;

    sput-object v0, Lw1/y$b;->a:Lw1/y$b;

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method
