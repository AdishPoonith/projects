.class public abstract Lla/m1;
.super Lla/g0;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lla/m1$a;
    }
.end annotation


# static fields
.field public static final l:Lla/m1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lla/m1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lla/m1$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lla/m1;->l:Lla/m1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lla/g0;-><init>()V

    return-void
.end method
