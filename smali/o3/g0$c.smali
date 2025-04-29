.class public final Lo3/g0$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo3/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lu2/n;

.field public final b:Lu2/q;

.field public final c:Ljava/io/IOException;

.field public final d:I


# direct methods
.method public constructor <init>(Lu2/n;Lu2/q;Ljava/io/IOException;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo3/g0$c;->a:Lu2/n;

    iput-object p2, p0, Lo3/g0$c;->b:Lu2/q;

    iput-object p3, p0, Lo3/g0$c;->c:Ljava/io/IOException;

    iput p4, p0, Lo3/g0$c;->d:I

    return-void
.end method
